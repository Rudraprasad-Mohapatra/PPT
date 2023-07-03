/*
Question 8
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
Example 1:


Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
 */
class Question_8{
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}; // true
        System.out.println(checkStraightLine(coordinates));
    }
    public static boolean checkStraightLine(int[][] coordinates){
            int deltaY = getYDiff(coordinates[1],coordinates[0]);
            int deltaX = getXDiff(coordinates[1],coordinates[0]);

            for(int i = 2; i < coordinates.length; i++){
                if(deltaY * getXDiff(coordinates[i],coordinates[0]) != deltaX * getYDiff(coordinates[i],coordinates[0])) return false; // (ΔY1 * ΔX2\Delta X2ΔX2 = ΔY2\Delta Y2ΔY2 * ΔX1\Delta X1ΔX1)
            }
            return true;
        }
         // Returns the delta Y
        public static int getYDiff(int[] a, int[] b){
            return a[1] - b[1];
        }

        // Returns the delta X
        public static int getXDiff(int[] a, int[] b){
            return a[0] - b[0];
        }
}