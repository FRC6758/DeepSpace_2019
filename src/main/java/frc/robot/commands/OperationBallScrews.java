/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.BallScrews;

public class OperationBallScrews extends Command {
  public OperationBallScrews() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_ballScrews);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    int pov = OI.controller.getPOV();

    if(OI.controller.getBumper(GenericHID.Hand.kLeft)) BallScrews.BallScrewOne.set(ControlMode.PercentOutput, RobotMap.SCREW_SPEED);
    else BallScrews.BallScrewOne.set(ControlMode.PercentOutput, -OI.controller.getTriggerAxis(GenericHID.Hand.kLeft));

    if(OI.controller.getBumper(GenericHID.Hand.kRight)) BallScrews.BallScrewTwo.set(ControlMode.PercentOutput, RobotMap.SCREW_SPEED);     
    else BallScrews.BallScrewTwo.set(ControlMode.PercentOutput, -OI.controller.getTriggerAxis(GenericHID.Hand.kRight));

    if(pov > 345 || pov < 15) Robot.m_ballScrews.up();
    else if(pov < 190 && pov > 170) Robot.m_ballScrews.down();
    else Robot.m_ballScrews.stop();
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
