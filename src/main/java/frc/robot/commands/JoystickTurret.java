package frc.robot.commands;

import frc.robot.subsystems.Turret;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class JoystickTurret extends CommandBase {
    private final Turret m_Turret;
    private double m_rotation;
    private double m_SpeedVal = 0.5;
    
    public JoystickTurret(Turret subsystem, double rotation){
        m_Turret = subsystem;
        addRequirements(m_Turret);
        m_rotation = rotation;
    }

    public void execute(){
        m_Turret.turnTurretDeadband(m_rotation * m_SpeedVal);
    }
}