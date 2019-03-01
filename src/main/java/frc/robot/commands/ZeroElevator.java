/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Elevator;

public class ZeroElevator extends Command {
  public ZeroElevator() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_elevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Zeroing The Elevator");
  } 

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Elevator.elevator.set(-RobotMap.ELEVATOR_AUTON);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Elevator.limit.get();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("Elevator Zeroed.");
    Elevator.elevator.reset();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
