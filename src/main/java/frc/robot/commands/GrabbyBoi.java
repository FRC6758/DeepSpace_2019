/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
<<<<<<< HEAD
import frc.robot.Robot;
=======
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.DriveTrain;
>>>>>>> 7bf2d9133d5305fb0eac2b54ad78bdd46d00d4ca

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
    if(OI.stick.getRawButton(RobotMap.OPEN_GRABBER)) Robot.m_grabber.open();
    else if(OI.stick.getRawButton(RobotMap.CLOSE_GRABBER)) Robot.m_grabber.grab();
    if(OI.stick.getRawButton(RobotMap.HATCH_KICKER)) Robot.m_grabber.dispenseHatch();
    else if(OI.stick.getRawButton(RobotMap.CARGO_KICKER)) Robot.m_grabber.dispenseCargo();
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
