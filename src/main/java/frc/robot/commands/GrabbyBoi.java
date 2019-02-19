/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Grabber;

public class GrabbyBoi extends Command {
  public GrabbyBoi() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_grabber);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    int pov = OI.stick.getPOV(); 
    
    if(RobotMap.GRABBER_DEBUG) {
      //DEBUGGING
      System.out.println("Joystick POV: " + pov);
    }

    if(pov == 0) Grabber.kicker.set(ControlMode.PercentOutput, RobotMap.KICKER_SPEED);
    else if(pov == 180) Grabber.kicker.set(ControlMode.PercentOutput, -RobotMap.KICKER_SPEED);
    else Grabber.kicker.set(ControlMode.PercentOutput, 0);
    if(OI.stick.getRawButton(RobotMap.CLOSE_GRABBER)) Grabber.arms.set(ControlMode.PercentOutput, RobotMap.ARM_SPEED);
    else Robot.m_grabber.open();
    // if(OI.stick.getRawButton(RobotMap.HATCH_KICKER)) Robot.m_grabber.pushHatch();
    // else Robot.m_grabber.pullHatch();
    
   // if(OI.controller.getBackButton()) new CargoGrab();

    // if(OI.controller.getStartButton()) Robot.m_grabber.preloadExtend();
    // else Robot.m_grabber.preloadRetract();
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
