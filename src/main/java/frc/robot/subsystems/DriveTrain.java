/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.Drive;
import frc.robot.extra.BrushlessMotor;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static BrushlessMotor FL = new BrushlessMotor(3);
  public static BrushlessMotor FR = new BrushlessMotor(0);
  public static BrushlessMotor BL = new BrushlessMotor(2);
  public static BrushlessMotor BR = new BrushlessMotor(1);

  public static SpeedControllerGroup leftMotor = new SpeedControllerGroup(FL, BL);
  public static SpeedControllerGroup rightMotor = new SpeedControllerGroup(FR, BR);

  public static DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new Drive());
  }
  public void resetEncoders(){
    FL.reset();
    FR.reset();
    BL.reset();
    BR.reset();
  }
  public double getLeft(){
    return FL.getDistance() + BL.getDistance() / 2;
    
  }
  public double getRight(){
    return FR.getDistance() + BR.getDistance() / 2; 
  }
public void stop() {
  leftMotor.stopMotor();
  rightMotor.stopMotor();
}

}
