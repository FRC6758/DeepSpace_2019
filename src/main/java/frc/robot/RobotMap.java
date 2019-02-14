/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  //Speeds
  public static final double AUTON_SPEED = .8;

  //===ELEVATOR CONTROLS===
  //Controllers
  public static final int ELEVATOR_MOTOR = 4;

  //Buttons
  public static final int ELEVATOR_UP = 5;
  public static final int ELEVATOR_DOWN = 3;
  
  //Speeds
  public static final double ELEVATOR_SPEED_UP = .8;
  public static final double ELEVATOR_SPEED_DOWN = .4;
  public static final double ELEVATOR_STALL_POWER = .15;
  public static final double ANTITIP_1 = .5;
  public static final double ANTITIP_2 = .2;

  //===GRABBER CONTROLS===
  //Buttons           
  public static final int OPEN_GRABBER = 0;
  public static final int CLOSE_GRABBER = 0;
  public static final int HATCH_KICKER = 0;      //TODO: SET THESE!!
  public static final int CARGO_KICKER = 0;

  //Controllers
  public static final int ARM_CONTROLLER = 30;
  public static final int FLYWHEELS_CONTROLLER = 31;

  //Speeds
  public static final double KICKER_SPEED = .8;
  public static final double ARM_SPEED = .4;
}
