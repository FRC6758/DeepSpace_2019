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
  //===MISC.===

  //Debugging
  public static final boolean DEBUGGING_BALLS = false;
  public static final boolean GRABBER_DEBUG = false;
  public static final boolean ELEVATOR_DEBUG = false;
  public static final boolean DRIVE_DEBUG = false;
    //Controls
  public static final int JOYSTICK_PORT = 1; //Side note: you can switch which one is
  public static final int CONTROLLER_PORT = 0; //which by clicking and dragging in DS

  public static final double JOYSTICK_OVERRIDE = .1;

  //Speeds
  public static final double AUTON_SPEED = .8;


  //===CAMERAS===
  //FPS
  public static int CAMERA_A_FPS = 30;
  public static int CAMERA_B_FPS = 30;

  //Resolutions
  public static int CAMERA_A_WIDTH = 240;
  public static int CAMERA_A_HEIGHT = 480;
  public static int CAMERA_B_WIDTH = 240;
  public static int CAMERA_B_HEIGHT = 480;


  //===DRIVE TRAIN===
  //Motor Controllers
  public static final int FL_PORT = 3;
  public static final int BL_PORT = 2;
  public static final int FR_PORT = 10;
  public static final int BR_PORT = 1;

  //===ELEVATOR CONTROLS===
  //DIO
  public static final int ELEVATOR_LIMIT_SWITCH = 0;
  public static final int ELEVATOR_ENC_A_PORT = 0;
  public static final int ELEVATOR_ENC_B_PORT = 0;

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
  public static final int HATCH_1 = 17;
  public static final int HATCH_2 = 63;
  public static final int HATCH_3 = 98;
  public static final int CARGO_1 = 30;
  public static final int CARGO_2 = 69;
  public static final int CARGO_3 = 106; 

  public static final int ELEVATOR_TOP_LIMIT = CARGO_3;
  public static final int ELEVATOR_MIDDLISH_LIMIT = 75;
  public static final int ELEVATOR_MIDDLE_LIMIT = 35;
  public static final int ELEVATOR_BOTTOM_LIMIT = 0;
  
  //Speeds
  public static final double ELEVATOR_AUTON = .8;
  public static final double ELEVATOR_AUTON_DOWN = ELEVATOR_AUTON * .4; //This allows you to change just one variable
  public static final double ELEVATOR_SPEED_UP = .6;
  public static final double ELEVATOR_SPEED_DOWN = .4;
  public static final double ELEVATOR_STALL_POWER = .05;
  public static final double ELEVATOR_ZEROING = .1;
  public static final double ANTITIP_1 = .7;
  public static final double ANTITIP_2 = .4;

  //Misc.
  public static final double ELEVATOR_RAMP_RATE = 5; //this is in seconds?


  //===GRABBER CONTROLS===
  //Buttons           
  public static final int OPEN_GRABBER = 00; //Currently auto open
  public static final int CLOSE_GRABBER = 1; 
  public static final int HATCH_KICKER = 2;     
  public static final int CARGO_KICKER = 00; //Uses Joystick POV
  public static final int CARGO_SUCKER = 00; //Uses Joystick POV

 //Encoder Values
  public static final int ARM_OPEN = 0;
  public static final int ARM_90 = 0;

  public static final int GRABBER_ENC_PORT_A = 0;
  public static final int GRABBER_ENC_PORT_B = 1;

  //Motor Controllers
  public static final int ARM_CONTROLLER = 31;
  public static final int FLYWHEELS_CONTROLLER = 36;

  //Solenoids
  public static final int AIR_BOI = 7;
  public static final int PRE_AIR_BOI = 0;

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
  public static final double INDIV_SCREW_SPEED_DOWN = .6;
  public static final double BALL_BOI = -1;

  //Encoder Values
  public static final int ELEVATOR_WARNING = 15;

  //Encoder Ports
  public static final int FRONT_ENC_A_PORT = 0;
  public static final int FRONT_ENC_B_PORT = 0;
  public static final int BACK_ENC_A_PORT = 0;
  public static final int BACK_ENC_B_PORT = 0;

  //Limit Switch Ports
  public static final int FRONT_TOP_LIMIT_PORT = 0;
  public static final int FRONT_BOTTOM_LIMIT_PORT = 0;
  public static final int BACK_TOP_LIMIT_PORT = 0;
  public static final int BACK_BOTTOM_LIMIT_PORT = 0;

}
