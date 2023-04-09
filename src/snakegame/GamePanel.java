/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JPanel;
/**
 *
 * @author bernardogandara
 */
public class GamePanel extends JPanel implements ActionListener{
    
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75; //higher number = slower game
    final int x[] = new int[GAME_UNITS];    //will hold x coordinates of the body parts of the snake
    final int y[] = new int[GAME_UNITS];    //will hold y coordinates of the body parts
    int bodyParts = 6;                      //Initial bodyparts of the snake
    int applesEaten;
    int appleX;                         //coordinate of where the apple is located
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    
    GamePanel(){    //GamePanel constructor
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
        
    }
    
    public void startGame(){
        
    }
    
    public void paintComponent(Graphics g){
        
    }
    
    public void draw(Graphics g){
        
    }
    
    public void newApple(){
        
        
    }
    public void move(){
        
    }
    
    public void checkApple(){
        
    }
    
    public void checkCollisions(){
        
    }
    
    public void gameOver(Graphics g){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void KeyPressed(KeyEvent e){
            
        }
    }
    
}
