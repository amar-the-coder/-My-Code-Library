public class shortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        float ans = getShortestPath(str);

        System.out.println(ans);
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // if south
            if (direction == 'S' || direction == 's')
                y--;
            // if north
            if (direction == 'N' || direction == 'n')
                y++;
            // if west
            if (direction == 'W' || direction == 'w')
                x--;
            // if east
            if (direction == 'E' || direction == 'e')
                x++;

        }

        int SquareOfX = x * x;
        int SquareOfY = y * y;
        return (float) Math.sqrt(SquareOfX + SquareOfY);
    }
}
