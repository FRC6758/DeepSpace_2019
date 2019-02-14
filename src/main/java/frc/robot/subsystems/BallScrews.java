/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.OperationBallScrews;

/**
 * Add your docs here.
 */
public class BallScrews extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static TalonSRX BallScrewOne = new TalonSRX(RobotMap.SCREW_ONE_CONTROLLER);
  public static TalonSRX BallScrewTwo = new TalonSRX(RobotMap.SCREW_TWO_CONTROLLER);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new OperationBallScrews());
  }

  public void up(){
    BallScrewOne.set(ControlMode.PercentOutput, -1);
    BallScrewTwo.set(ControlMode.PercentOutput, -1);
  }

  public void down(){
    BallScrewOne.set(ControlMode.PercentOutput, 1);
    BallScrewTwo.set(ControlMode.PercentOutput, 1);
  }
  public void stop(){
    BallScrewOne.set(ControlMode.PercentOutput, 0);
    BallScrewTwo.set(ControlMode.PercentOutput, 0);
  }
}
