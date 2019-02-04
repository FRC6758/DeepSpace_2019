/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.vision;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Timer;
import java.util.TimerTask;

import com.google.gson.Gson;

/**
 * Add your docs here.
 */
public class Vision implements Runnable {

    public static RIOCommand command = RIOCommand.NONE;
    private static DatagramSocket sock;
    public static boolean active = true;
    public static Vision v;
    public static Thread t;
    private static Gson gson = new Gson();

    public void run() {
        while(active) {
            byte[] buffer = new byte[1024];
            DatagramPacket pack = new DatagramPacket(buffer, buffer.length);
            try {
                sock.receive(pack);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String str = "";
            try {
                str = new String(buffer, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            str = str.replace("\0", "");
            //System.out.println(str);
            CommandPacket pack2 = gson.fromJson(str, CommandPacket.class);
            command = RIOCommand.valueOf(pack2.command);
        }
    }

    static class CommandPacket {
        public String command;
        public Object distance;
    }

    public static void startRecieve() {
        active = true;
        t.start();
        
        Timer t = new Timer();
        /*t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(command.toString());
            }
        }, 5000, 5000);*/
    }

    public static void stopRecieve() {
        active = false;
    }

    static {
        v = new Vision();
        t = new Thread(v);
        try {
            sock = new DatagramSocket(5802);
        } catch (SocketException e) {
            e.printStackTrace();
		}
    }

    public enum RIOCommand {
        LEFT,
        RIGHT,
        NONE,
        ALIGNED
    }

}