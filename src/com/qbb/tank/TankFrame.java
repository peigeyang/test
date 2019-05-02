package com.qbb.tank;

import java.awt.*;
import java.awt.event.*;

public class TankFrame extends Frame {

    boolean bL = false;
    boolean bU = false;
    boolean bR = false;
    boolean bD = false;

    int x = 200 , y = 200;
    public TankFrame() throws HeadlessException {
        setSize(800,600);
        //sizable 设置大小
        setResizable(false);
        setTitle("tank war");

        this.addKeyListener(new MyKeyListener());


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g.fillRect(x,y,20,40);
        //x += 10;
        //y += 10;
    }

    class MyKeyListener extends KeyAdapter {


        @Override
        public void keyPressed(KeyEvent e) {
            //x -= 50;
            //y += 30;
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            bL = false;
            bU = false;
            bR = false;
            bD = false;
        }
    }
}
