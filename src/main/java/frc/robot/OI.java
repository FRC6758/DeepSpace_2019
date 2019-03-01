/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Controller;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public static Joystick stick = new Joystick(RobotMap.JOYSTICK_PORT);
  public static XboxController controller = new XboxController(RobotMap.CONTROLLER_PORT);
  
  Button hatch_lvl_1 = new JoystickButton(stick, RobotMap.HATCH_LVL_1);
  Button cargo_lvl_1 = new JoystickButton(stick, RobotMap.CARGO_LVL_1);
  Button hatch_lvl_2 = new JoystickButton(stick, RobotMap.HATCH_LVL_2);
  Button cargo_lvl_2 = new JoystickButton(stick, RobotMap.CARGO_LVL_2);
  Button hatch_lvl_3 = new JoystickButton(stick, RobotMap.HATCH_LVL_3);
  Button cargo_lvl_3 = new JoystickButton(stick, RobotMap.CARGO_LVL_3);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  hatch_lvl_1.whenPressed(new ElevatorLevels(Level.HATCH_1));
  cargo_lvl_1.whenPressed(new ElevatorLevels(Level.CARGO_1));
  hatch_lvl_2.whenPressed(new ElevatorLevels(Level.HATCH_2));
  cargo_lvl_2.whenPressed(new ElevatorLevels(Level.CARGO_2));
  hatch_lvl_3.whenPressed(new ElevatorLevels(Level.HATCH_3));
  cargo_lvl_3.whenPressed(new ElevatorLevels(Level.CARGO_3));

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
