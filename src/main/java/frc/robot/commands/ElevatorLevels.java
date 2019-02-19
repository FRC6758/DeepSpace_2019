/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Elevator;

public class ElevatorLevels extends Command {

    enum Level{
        HATCH_1, HATCH_2, HATCH_3, CARGO_1, CARGO_2, CARGO_3;
    }

    Level level;
    int goal;
    boolean up;
  public ElevatorLevels(Level level) {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_elevator);
    this.level = level;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
        switch (level) {
            case HATCH_1:
                goal = RobotMap.HATCH_1;
                break;
            case CARGO_1:
                goal = RobotMap.CARGO_1;
                break;
            case HATCH_2:
                goal = RobotMap.HATCH_2;
                break;
            case CARGO_2:
                goal = RobotMap.CARGO_2;
                break;
            case HATCH_3:
                goal = RobotMap.HATCH_3;
                break;
            case CARGO_3:
                goal = RobotMap.CARGO_3;
                break;
           default:
            System.out.println("NOT A LEVEL!");
                break;
        }
        up = goal > Elevator.elevator.getPosition();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
        if(goal > Elevator.elevator.getPosition()) Elevator.elevator.set(RobotMap.ELEVATOR_AUTON);
        else if(goal < Elevator.elevator.getPosition()) Elevator.elevator.set(-RobotMap.ELEVATOR_AUTON_DOWN);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
      if(up) return Elevator.elevator.getPosition() > goal;
      return Elevator.elevator.getPosition() < goal;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
      Elevator.elevator.set(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
