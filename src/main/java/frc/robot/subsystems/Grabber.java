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

  //public static TalonSRX arms = new TalonSRX(RobotMap.ARM_CONTROLLER);
  //public static TalonSRX kicker = new TalonSRX(RobotMap.FLYWHEELS_CONTROLLER);
  public static Solenoid puncher = new Solenoid(RobotMap.AIR_BOI);
  public static Solenoid preloader = new Solenoid(RobotMap.PRE_AIR_BOI);

  //public static Encoder enc = new Encoder(RobotMap.GRABBER_ENC_PORT_A, RobotMap.GRABBER_ENC_PORT_B);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new GrabbyBoi());
  }

  public void preloadExtend(){
     preloader.set(true);
  }

  public void preloadRetract(){
    preloader.set(false);
  }

  /*public void dispenseCargo(){
    kicker.set(ControlMode.PercentOutput, RobotMap.KICKER_SPEED);
  }

  public void suckCargo(){
    kicker.set(ControlMode.PercentOutput, -RobotMap.KICKER_SPEED);
  }

  public void grab(){
    arms.set(ControlMode.PercentOutput, -RobotMap.ARM_SPEED);
  }*/

  public void open(){
    //if(enc.getRaw() > RobotMap.ARM_OPEN) arms.set(ControlMode.PercentOutput, RobotMap.ARM_SPEED);
  }

  public void pushHatch(){
       Grabber.puncher.set(true);
  }

  public void pullHatch(){
    Grabber.puncher.set(false);

  }

}
