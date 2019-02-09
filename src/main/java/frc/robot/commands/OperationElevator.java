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
    // eg. requires(chassis);
    requires(Robot.m_elevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //ADDED: bottom and top limits to avoid damage
    //TODO: Continue to run motor at .1 to keep it up 
    if(OI.stick.getRawButton(RobotMap.ELEVATOR_UP) && Robot.m_elevator.elevator.getPosition() < 120) Robot.m_elevator.elevator.set(RobotMap.ELEVATOR_SPEED_UP);
    else if (OI.stick.getRawButton(RobotMap.ELEVATOR_DOWN) && Robot.m_elevator.elevator.getPosition() > 0) Robot.m_elevator.elevator.set(-RobotMap.ELEVATOR_SPEED_DOWN);
    else Robot.m_elevator.elevator.set(0);
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
