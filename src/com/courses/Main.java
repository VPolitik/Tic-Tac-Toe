package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                int ch;

                do {

                    Scanner in = new Scanner(System.in);


                    char h[] = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};


                    for (int i = 0; i < 9; i++) {

                        System.out.println("-7-|-8-|-9-");
                        System.out.println("-4-|-5-|-6-");
                        System.out.println("-1-|-2-|-3-");

                        System.out.println("-" + h[6] + "-|-" + h[7] + "-|-" + h[8] + "-");
                        System.out.println("-" + h[3] + "-|-" + h[4] + "-|-" + h[5] + "-");
                        System.out.println("-" + h[0] + "-|-" + h[1] + "-|-" + h[2] + "-");

                        int move = 0;
                        System.out.println("Введите клетку в которую хотите походить: ");
                        move = in.nextInt();

                        while (move > 9 || move < 1 || h[move - 1] != '-') {
                            System.out.println("No!");
                            move = in.nextInt();
                        }
                        System.out.println("Hod " + move);
                        if (i % 2 == 0) {
                            h[move - 1] = 'X';
                        } else h[move - 1] = 'O';

                        if (h[0] == h[1] && h[1] == h[2] && h[2] != '-') {
                            if (h[0] == 'X') {
                                System.out.println("Победил первый игрок");
                            } else {
                                System.out.println("Победил второй игрой");
                            }
                            break;
                        }
                        if (h[3] == h[4] && h[4] == h[5] && h[5] != '-') {
                            if (h[3] == 'X') {
                                System.out.println("Победил первый игрок");
                            } else {
                                System.out.println("Победил второй игрок");
                            }
                            break;
                        }
                        if (h[6] == h[7] && h[7] == h[8] && h[8] != '-') {
                            if (h[8] == 'X') {
                                System.out.println("Победил первы игрок");
                            } else {
                                System.out.println("Победил второй игрок");
                            }
                            break;
                        }
                        if (h[0] == h[4] && h[4] == h[8] && h[8] != '-') {
                            if (h[8] == 'X') {
                                System.out.println("Победил первый игрок");
                            } else {
                                System.out.println("Победил второй игрок");
                            }

                            break;
                        }
                        if (h[2] == h[4] && h[4] == h[6] && h[6] != '-') {
                            if (h[6] == 'X') {
                                System.out.println("Победил первый игрок");
                            } else {
                                System.out.println("Победил второй игрок");
                            }
                            break;
                        }
                        if (h[0] == h[3] && h[3] == h[6] && h[6] != '-') {
                            if (h[6] == 'X') {
                                System.out.println("Победил первый игрок");
                            } else {
                                System.out.println("Победил второй игрок");
                            }
                            break;
                        }
                        if (h[1] == h[4] && h[4] == h[7] && h[7] != '-') {
                            if (h[7] == 'X') {
                                System.out.println("Победил первый игрок");
                            } else {
                                System.out.println("Победил второй игрой");
                            }
                            break;
                        }
                        if (h[2] == h[5] && h[5] == h[8] && h[8] != '-') {
                            if (h[8] == 'X') {
                                System.out.println("Победил первый игрок");
                            } else {
                                System.out.println("Победил второй игрок");
                            }
                            break;
                        }
                        if (h[0] != '-' && h[1] != '-' && h[2] != '-' && h[3] != '-' && h[4] != '-' && h[5] != '-' && h[6] != '-' && h[7] != '-' && h[8] != '-') {
                            System.out.println("Все поле занятно! У вас ничья! ");
                            break;
                        }
                    }
                    System.out.println(" Сыграть ещё раз?");
                    ch = in.nextInt();
                    if (ch > 1 || ch <= 0) {
                        System.out.println("Игра окончена");
                        break;
                    }
                } while (ch != '1');
    }
}
