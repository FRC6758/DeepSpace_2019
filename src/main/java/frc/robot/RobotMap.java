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
  //DIO
  public static final int ELEVATOR_LIMIT_SWITCH = 0;

  //Motor Controllers
  public static final int ELEVATOR_MOTOR = 4;

  //Buttons
  public static final int ELEVATOR_UP = 6;
  public static final int ELEVATOR_DOWN = 4;

  public static final int HATCH_LVL_1 = 8;
  public static final int HATCH_LVL_2 = 10;
  public static final int HATCH_LVL_3 = 12;
  public static final int CARGO_LVL_1 = 7;
  public static final int CARGO_LVL_2 = 9;
  public static final int CARGO_LVL_3 = 11;
  
  //Encoder Values
  public static final int HATCH_1 = 0;
  public static final int HATCH_2 = 0;
  public static final int HATCH_3 = 0;
  public static final int CARGO_1 = 0;
  public static final int CARGO_2 = 0;
  public static final int CARGO_3 = 0;

  public static final int ELEVATOR_TOP_LIMIT = 106;
  public static final int ELEVATOR_MIDDLISH_LIMIT = 75;
  public static final int ELEVATOR_MIDDLE_LIMIT = 35;
  public static final int ELEVATOR_BOTTOM_LIMIT = 0;
  
  //Speeds
  public static final double ELEVATOR_SPEED_UP = .6;
  public static final double ELEVATOR_SPEED_DOWN = .4;
  public static final double ELEVATOR_STALL_POWER = .05;
  public static final double ANTITIP_1 = .7;
  public static final double ANTITIP_2 = .4;

  //===GRABBER CONTROLS===
  //Buttons           
  public static final int OPEN_GRABBER = 00; //PID UP
  public static final int CLOSE_GRABBER = 00; //PID DOWN
  public static final int HATCH_KICKER = 8;     
  public static final int CARGO_KICKER = 5;
  public static final int CARGO_SUCKER = 3;

  //Motor Controllers
  public static final int ARM_CONTROLLER = 31;
  public static final int FLYWHEELS_CONTROLLER = 36;

  //Speeds
  public static final double KICKER_SPEED = 1;
  public static final double ARM_SPEED = .4;

  //===BALL SCREW CONTROLS===
  //Buttons
  public static final int SCREW_ONE_DOWN = 0; //Right Trigger
  public static final int SCREW_ONE_UP = 0; //Right Bumper
  public static final int SCREW_TWO_DOWN = 0; //Left Trigger
  public static final int SCREW_TWO_UP = 0; //Left Bumper
  public static final int SCREW_UP = 0; //Using D-pad
  public static final int SCREW_DOWN = 0; //Using D-pad

  //Motor Controllers
  public static final int SCREW_ONE_CONTROLLER = 32;
  public static final int SCREW_TWO_CONTROLLER = 30;
  public static final int SCREW_GO = 33;

  //Speeds
  public static final double SCREW_SPEED = .2;
  public static final double BALL_BOI = .2;
}
