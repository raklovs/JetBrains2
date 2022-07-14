package IntroductionInOOP;

    class Quadrate implements Geometric {

        private int sideA;

        Quadrate(int sideA) {
            this.sideA = sideA;
        }

        public String getName() {
            return "quadrate";
        }

        public int getSquare() {
            var square = sideA * sideA;
            return square;
        }

    }
