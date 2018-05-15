package com.sonc.fc.up.pt.shared;

import java.util.List;

public class Movie {
	private List<Frame> frames;

    public static class Frame {
        private List<Oblong> oblongs;
        private List<Score> scores;
        public Frame(){
        }

        public List<Oblong> getOblongs() {
            return oblongs;
        }

        public List<Score> getScores() {
            return scores;
        }

    };

    public static class Oblong {
        int x;
        int y;
        float heading;
        int size;
        String color;
        public Oblong(int x, int y, float heading, int size, String color) {
            this.x = x;
            this.y = y;
            this.heading = heading;
            this.size = size;
            this.color = color;
        }

        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public float getHeading() {
            return heading;
        }
        public int getSize() {
            return size;
        }

        public String getColor() {
            return color;
        }

    };

    public static class Score {
        private String name;
        private int points;
        private int status;
        public Score(String name, int points, int status) {
            this.name = name;
            this.points = points;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public int getPoints() {
            return points;
        }

        public int getStatus() {
            return status;
        }
    };

    public Movie(){
    }
    public List<Frame> getFrames() {
        return frames;
    }
    
    public void newFrame() {
    }

    public void addOblong(int x, int y, float heading, int size, String color) {
    }
    
    public void addScore(String name, int points, int status) {
    }

}
