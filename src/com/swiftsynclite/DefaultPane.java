package com.swiftsynclite;

import javax.swing.*;
import java.awt.*;

public class DefaultPane extends JPanel {
    JLabel header;
    JSeparator separator;
    static final Font HEADER_FONT = new Font("Arial",Font.BOLD, 35);
    DefaultPane(String headerText){
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        header = new JLabel((headerText == null ? "com.swiftsynclite.DefaultPane" : headerText));
        header.setFont(HEADER_FONT);
        header.setHorizontalAlignment(SwingConstants.LEFT);
        header.setHorizontalTextPosition(SwingConstants.LEFT);

        separator = new JSeparator();

        headerPanel.setMaximumSize(new Dimension(Short.MAX_VALUE,header.getPreferredSize().height + 10));
        headerPanel.add(header);
        add(headerPanel);
        add(separator);
    }
}