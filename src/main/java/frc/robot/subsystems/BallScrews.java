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
  public static TalonSRX driver = new TalonSRX(RobotMap.SCREW_GO);
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new OperationBallScrews());
  }

  public void up(){
    //TODO: MAKE CONSTANTS FOR THESE IN ROBOTMAP.JAVA
    BallScrewOne.set(ControlMode.PercentOutput, -.8);
    BallScrewTwo.set(ControlMode.PercentOutput, -.65);
    if(!(Elevator.elevator.getPosition() < RobotMap.ELEVATOR_WARNING)) System.out.println("PUT ELEVATOR DOWN BEFORE USING BALL SCREWS!");
  }

  public void downFront(){
      BallScrewOne.set(ControlMode.PercentOutput, -RobotMap.INDIV_SCREW_SPEED_DOWN);
  }

  public void upFront(double speed){
    BallScrewOne.set(ControlMode.PercentOutput, speed);
  }

  public void downBack(){
    BallScrewTwo.set(ControlMode.PercentOutput, -RobotMap.INDIV_SCREW_SPEED_DOWN);
  }

  public void upBack(double speed){
    BallScrewTwo.set(ControlMode.PercentOutput, speed);
  }

  public void down(){
    //TODO: MAKE THESE CONSTANTS IN ROBOTMAP.JAVA
    BallScrewOne.set(ControlMode.PercentOutput, .8);
    BallScrewTwo.set(ControlMode.PercentOutput, .8);
    if(!(Elevator.elevator.getPosition() < RobotMap.ELEVATOR_WARNING)) System.out.println("PUT ELEVATOR DOWN BEFORE USING BALL SCREWS!");
  }
  public void stop(){
    BallScrewOne.set(ControlMode.PercentOutput, 0);
    BallScrewTwo.set(ControlMode.PercentOutput, 0);
  }

  public void stopForward(){
    driver.set(ControlMode.PercentOutput, 0);
  }

  public void forward(){
    driver.set(ControlMode.PercentOutput, RobotMap.BALL_BOI);
  }

  public void backward(){
    driver.set(ControlMode.PercentOutput, -RobotMap.BALL_BOI);
  }
}
