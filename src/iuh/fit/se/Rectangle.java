package iuh.fit.se;

    public class Rectangle {

        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double ChuVi() {
            return 2 * (length + width);
        }

        public double Dientich() {
            return length * width;
        }

        @Override
        public String toString() {
            return "Rectangle [length = " + length + ", width = " + width + "]";
        }
    }

