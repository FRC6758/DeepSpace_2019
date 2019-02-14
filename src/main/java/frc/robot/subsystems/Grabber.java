/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.GrabbyBoi;

/**
 * Add your docs here.
 */
public class Grabber extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static TalonSRX arms = new TalonSRX(RobotMap.ARM_CONTROLLER);
  public static TalonSRX kicker = new TalonSRX(RobotMap.FLYWHEELS_CONTROLLER);
  public static Solenoid puncher = new Solenoid(0);

  public static Encoder enc = new Encoder(0, 1);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new GrabbyBoi());
  }

  public void dispenseCargo(){
    kicker.set(ControlMode.PercentOutput, RobotMap.KICKER_SPEED);
  }

  public void suckCargo(){
    kicker.set(ControlMode.PercentOutput, -RobotMap.KICKER_SPEED);
  }

  public void grab(){
    arms.set(ControlMode.PercentOutput, -RobotMap.ARM_SPEED);
  }

  public void open(){
    arms.set(ControlMode.PercentOutput, RobotMap.ARM_SPEED);
  }

  public void dispenseHatch(){
    puncher.set(true);
  }
}
