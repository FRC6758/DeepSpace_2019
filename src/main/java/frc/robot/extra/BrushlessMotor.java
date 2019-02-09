/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.extra;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

/**
 * Add your docs here.
 */
public class BrushlessMotor extends CANSparkMax{

    private static final int PULSES_PER_INCH = 24;
    private static final double CONVERSTION_FACTOR = .00243;
    private static final double ANGLE_FACTOR = 1;
    private static double offset;
    CANEncoder encoder;

    public BrushlessMotor(int deviceID){
        super(deviceID, MotorType.kBrushless);
        encoder = this.getEncoder();
    }

    public double getSpeed(){
        //calculated in ft/sec
        return encoder.getVelocity() * CONVERSTION_FACTOR;
    }

    public double getMPH(){
        //just for fun
        return this.getSpeed() * .0114;
    }

    public void reset(){
        offset = encoder.getPosition();
    }

    public double getRaw(){
        return encoder.getPosition();
    }

    public double getPosition(){
        return encoder.getPosition() - offset;
    }

    public double getAngle(){
        return (encoder.getPosition() - offset) / ANGLE_FACTOR;
    }

    public double getDistance(){
        return encoder.getPosition() - offset / PULSES_PER_INCH;
    }

}
