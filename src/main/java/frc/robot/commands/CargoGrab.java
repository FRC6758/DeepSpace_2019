/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Grabber;

public class CargoGrab extends Command {
  private boolean open;

  public CargoGrab() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_grabber);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    //open = (Grabber.enc.getRaw() > RobotMap.ARM_90);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //if(open) Grabber.arms.set(ControlMode.PercentOutput, -RobotMap.ARM_SPEED);
    //else Grabber.arms.set(ControlMode.PercentOutput, RobotMap.ARM_SPEED);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    // if(open) return Grabber.enc.getRaw() < RobotMap.ARM_90;
    // return Grabber.enc.getRaw() > RobotMap.ARM_90;
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    //Grabber.arms.set(ControlMode.PercentOutput, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
