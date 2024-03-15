package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubSystem extends SubsystemBase {
    private final CANSparkMax roller = new CANSparkMax(5,MotorType.kBrushless);
    //private double speed = 0.75;
    public IntakeSubSystem(){
    }
    public void setRoller(double speed){
            roller.setInverted(false);
            roller.set(speed);
    }
    public void setNRoller(double speed){
            roller.setInverted(true);
            roller.set(speed);
}
}
