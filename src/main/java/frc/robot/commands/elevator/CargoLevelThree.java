/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.elevator;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class CargoLevelThree extends Command {
  public CargoLevelThree() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_elevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.m_elevator.m_elevator.getEncoder().getPosition() < RobotMap.ELEVATOR_ENCODER_L3) 
      Robot.m_elevator.m_elevator.set(RobotMap.ELEVATOR_SPEED_UP);
    else Robot.m_elevator.m_elevator.set(-RobotMap.ELEVATOR_SPEED_DOWN);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Math.abs(Robot.m_elevator.m_elevator.getEncoder().getPosition()-RobotMap.ELEVATOR_ENCODER_L3) < 10;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_elevator.m_elevator.set(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
