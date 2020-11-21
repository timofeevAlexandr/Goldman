package com.alex.main;

import com.alex.gui.frames.FrameMainMenu;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new FrameMainMenu().setVisible(true));
    }
}
