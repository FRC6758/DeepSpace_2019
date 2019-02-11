/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.OperationElevator;
import frc.robot.extra.BrushlessMotor;

/**
 * Add your docs here.
 */
public class Elevator extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
<<<<<<< HEAD
  public BrushlessMotor elevator = new BrushlessMotor(RobotMap.ELEVATOR_MOTOR);
=======

  public BrushlessMotor m_elevator = new BrushlessMotor(RobotMap.ELEVATOR_MOTOR);
>>>>>>> 3682b998c691bf35d85299edbd7ca63c7c54c430

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new OperationElevator());
  }
}
