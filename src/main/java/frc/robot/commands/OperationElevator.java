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

public class OperationElevator extends Command {
  public OperationElevator() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_elevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
      //TODO: YOU NEED TO FIND ZERO (that may not go here but it needs to happen at some point)
      Elevator.elevator.setClosedLoopRampRate(5);

      //Robot.m_elevator.zero();

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    int pov = OI.controller.getPOV();
    
    System.out.println("Encoder VALUES: " + Elevator.elevator.getPosition());

    //ADDED: bottom and top limits to avoid damage
    if(pov == 0 && Elevator.elevator.getPosition() < RobotMap.ELEVATOR_TOP_LIMIT) Elevator
    .elevator.set(RobotMap.ELEVATOR_SPEED_UP);
    else if (pov == 180 && Elevator.elevator.getPosition() > RobotMap.ELEVATOR_BOTTOM_LIMIT && Elevator.limit.get()) Elevator.elevator.set(-RobotMap.ELEVATOR_SPEED_DOWN);
    else if (Elevator.elevator.getPosition() > RobotMap.ELEVATOR_MIDDLE_LIMIT && Elevator.elevator.getPosition()< RobotMap.ELEVATOR_TOP_LIMIT) Elevator.elevator.set(RobotMap.ELEVATOR_STALL_POWER);
    else Elevator.elevator.stopMotor();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
