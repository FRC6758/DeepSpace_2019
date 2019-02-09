/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.vision.Vision;

public class AlginHelper extends CommandGroup {
  /**
   * Add your docs here.
   */
  public AlignHelper() {
    switch(Vision.command){
      case NONE:
        System.out.println("Vision targets not detected.");
        return;
      break;
      case RIGHT:
        addSequential(new CW(45));
        addSequential(new DriveBackward(1));
        addSequential(new CCW(45));
      break;
      case LEFT:
        addSequential(new CCW(45));
        addSequential(new DriveBackward(1));
        addSequential(new CW(45));
      break;
      case ALIGNED:
        addSequential(new DriveForward());
      break;
    }



  }
}
