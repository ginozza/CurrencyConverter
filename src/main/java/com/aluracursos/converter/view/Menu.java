package com.aluracursos.converter.view;

public class Menu {
    LookAndFeel lf = new LookAndFeel();

    String menuArt = lf.cyan(
            """
                    ⠀⣠⣄⠀⠀⢀⣀⣀⡀⡀⢀⣀⢀⣀⢀⣀⠀⠀⣀⣠⣤⣤⡀⠀⠈⡧⣄⠤⠀
                    ⠘⡿⣿⠀⠀⠈⠀⠉⠁⠀⠁⠁⠊⠁⠈⠉⢰⣿⠟⠉⠈⢻⣿⣷⠀⣹⢾⣳⡄
                    ⠀⠁⠉⠀⠀⠀⠠⢤⢀⡤⢤⣀⡤⢤⡀⠀⠈⣿⣂⢰⣀⠾⣿⡿⠀⢻⣾⡟⠑
                    ⠀⠀⠀⠀⠀⠀⠀⢸⡿⣄⣸⠻⣄⣨⠃⠀⠘⡇⣬⠄⠄⣼⡧⠏⠀⠀⠉⣥⠀
                    ⠀⠀⠀⠀⠀⠀⠀⢀⡴⣾⢯⣶⠶⢤⠀⠀⠀⢻⡟⠉⣁⣾⣿⡀⠀⠀⠠⣿⠀
                    ⠀⠀⠀⠀⠀⠀⠰⣿⡼⢿⡳⢟⣿⣽⡇⢀⣤⣾⣿⣟⣻⡵⣿⢿⠶⣄⡀⠉⠀
                    ⠀⠐⠖⠂⠖⠖⠀⠿⣷⣼⢥⣼⣿⡿⠃⠘⢟⠿⣯⠿⣯⣷⢻⠞⠦⠏⠃⠀⠀
                    ⠀⠀⠀⠛⠘⠉⠀⠀⠈⠉⠓⠋⠁⠀⠀⠀⠀⠙⠑⠊⠉⠓⠉⠂⠈⠐⠃⠚
                    """);

    String menuTitle = lf.boldColor("---------------- Currency Converter ", lf.CYAN) + "\n";

    public void showMenu() {
       System.out.print(menuArt + menuTitle);
    }
}
