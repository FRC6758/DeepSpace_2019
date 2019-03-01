/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.OperationElevator;
import frc.robot.extra.BrushlessMotor;

public class Elevator extends Subsystem {
  public static BrushlessMotor elevator = new BrushlessMotor(RobotMap.ELEVATOR_MOTOR);
  public static DigitalInput limit = new DigitalInput(RobotMap.ELEVATOR_LIMIT_SWITCH);

  @Override
  public void initDefaultCommand() {
     setDefaultCommand(new OperationElevator());
     elevator.setOpenLoopRampRate(RobotMap.ELEVATOR_RAMP_RATE);
  }

  // public void zero(){
  //   while(!Elevator.limit.get()){
  //     Elevator.elevator.set(-RobotMap.ELEVATOR_ZEROING);
  //   }
  //   Elevator.elevator.reset();
  //   System.out.println("Elevator Ready!");
  // }
}
