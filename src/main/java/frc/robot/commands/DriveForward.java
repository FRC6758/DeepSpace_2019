/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.sql.DriverPropertyInfo;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.DriveTrain;

public class DriveForward extends Command {
 private double goal;
  public DriveForward(double distance) {
  goal = distance;
    // Use requires() here to declare subsystem dependencies
      requires(Robot.m_drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  Robot.m_drivetrain.resetEncoders();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  if(Robot.m_drivetrain.getRight() < goal) DriveTrain.rightMotor.set(RobotMap.AUTON_SPEED);
  else DriveTrain.rightMotor.stopMotor();
  if(Robot.m_drivetrain.getLeft() < goal) DriveTrain.leftMotor.set(RobotMap.AUTON_SPEED);
  else DriveTrain.leftMotor.stopMotor();

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return (Robot.m_drivetrain.getRight() > goal && Robot.m_drivetrain.getLeft() > goal) || OI.stick.getY() > .1 || OI.stick.getY() < -.1;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_drivetrain.stop();
    System.out.println("DriveForward Completed");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
