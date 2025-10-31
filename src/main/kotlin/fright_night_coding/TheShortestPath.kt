package fright_night_coding

/* This program finds the shortest path in a maze from a starting point 'P' to a goal point 'G'.
 * The maze is represented as a grid of characters, where '#' represents walls and '.' represents open paths.
 * The program uses breadth-first search (BFS) to explore the maze and find the shortest path.
 * It outputs the sequence of moves (U, D, L, R) to reach the goal from the start.
 */

fun main() {
    val maze = mutableListOf<String>()
    for (i in 0 until 50) {
        maze.add(readln())
    }
    val start = mutableListOf<Int>()
    val goal = mutableListOf<Int>()
    for (i in maze.indices) {
        for (j in maze[i].indices) {
            if (maze[i][j] == 'P') {
                start.add(i)
                start.add(j)
            }
            if (maze[i][j] == 'G') {
                goal.add(i)
                goal.add(j)
            }
        }
    }
    val directions = listOf(
        Pair(-1, 0) to 'U',
        Pair(1, 0) to 'D',
        Pair(0, -1) to 'L',
        Pair(0, 1) to 'R'
    )
    val queue = ArrayDeque<Triple<Int, Int, String>>()
    val visited = mutableSetOf<Pair<Int, Int>>()
    queue.add(Triple(start[0], start[1], ""))
    visited.add(Pair(start[0], start[1]))
    while (queue.isNotEmpty()) {
        val (x, y, path) = queue.removeFirst()
        if (x == goal[0] && y == goal[1]) {
            println(path)
            return
        }
        for ((dir, move) in directions) {
            val newX = x + dir.first
            val newY = y + dir.second
            if (newX in maze.indices && newY in maze[0].indices &&
                maze[newX][newY] != '#' && Pair(newX, newY) !in visited
            ) {
                visited.add(Pair(newX, newY))
                queue.add(Triple(newX, newY, path + move))
            }
        }
    }
}
