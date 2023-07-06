// © Eyad Hantouli.
// Github: Eyad-Hantouli
// LinkedIn: https://www.linkedin.com/in/eyad-hantouli-03a504220/

// Remove the comments from the lines you want to execute.
// example: Line(20) & Line(21).

import search.BinarySearch;
import search.InterpolationSearch;
import search.LinearSearch;
import sort.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    final static int[] ARRAY = new int[] {1, 3, 5, 1, 7, 4, 1, 3, 5, 0};

    public static void main(String[] args) {
        //--------------------------------------- SORTING ALGORITHMS ---------------------------------------

        // 1- Bubble Sort O(n^2)

//        int[] sortedArray = BubbleSort.Sort(ARRAY);
//        System.out.print(Arrays.toString(sortedArray));
//        --------------------------------------------------------------------------------------------------

        // 2- Counting Sort O(n)

//        int[] sortedArray = CountingSort.Sort(ARRAY);
//        System.out.print(Arrays.toString(sortedArray));
//        --------------------------------------------------------------------------------------------------

        // 3- Merge Sort O(n * log(n))

//        int[] sortedArray = MergeSort.Sort(ARRAY);
//        System.out.print(Arrays.toString(sortedArray));
//        --------------------------------------------------------------------------------------------------

        // 4- Selection Sort O(n ^ 2)

//        int[] sortedArray = SelectionSort.Sort(ARRAY);
//        System.out.print(Arrays.toString(sortedArray));
//        --------------------------------------------------------------------------------------------------

        // 5- Insertion Sort O(n ^ 2)

//        int[] sortedArray = InserionSort.Sort(ARRAY);
//        System.out.print(Arrays.toString(sortedArray));
//        --------------------------------------------------------------------------------------------------

        // 6- Quick Sort O(n ^ 2)

//        int[] sortedArray = QuickSort.Sort(ARRAY);
//        System.out.print(Arrays.toString(sortedArray));
//        --------------------------------------------------------------------------------------------------







        //--------------------------------------- SEARCHING ALGORITHMS ---------------------------------------

        // 1- Linear Search O(n) | first appearance
//        int index = LinearSearch.Search(ARRAY, 4);
//        System.out.print(index);
//        --------------------------------------------------------------------------------------------------

        // 2- Binary Search O(log(n)) | sorted array | first appearance
//        int[] sortedArray = new int[] {0, 1, 1, 1, 3, 3, 4, 5, 5, 7};
//        int index = BinarySearch.Search(sortedArray, 4);
//        System.out.print(index);
//        --------------------------------------------------------------------------------------------------

        // 3- Interpolation Search O(n) | sorted array | first appearance | Interval between elements almost be uniform
//        int[] sortedArray = new int[] {0, 1, 1, 1, 3, 3, 4, 5, 5, 7};
//        int index = InterpolationSearch.Search(sortedArray, 4);
//        System.out.print(index);
//        --------------------------------------------------------------------------------------------------







        //--------------------------------------- Graph ALGORITHMS ---------------------------------------

        // 1- BFS
        class Graph {
            int E, V;
            LinkedList<Integer>[] adj;

            public Graph (int nodes) {
                V = nodes;
                E = 0;
                adj = new LinkedList[nodes];
                for (int i = 0; i<nodes; i++) {
                    adj[i] = new LinkedList<>();
                }
            }

            public void addEdge (int u, int v) {
                adj[u].add(v);
                adj[v].add(u);
                E++;
            }

            public void bfs(int node) {
                boolean[] visited = new boolean[V];
                Queue<Integer> queue = new LinkedList<>();

                visited[node] = true;
                queue.offer(node);

                while (! queue.isEmpty()) {
                    int u = queue.poll();

                    System.out.println(u);

                    for (int i : adj[u]) {
                        if (! visited[i]) {
                            visited[i] = true;
                            queue.offer(i);
                        }
                    }
                }


            }

        }

//        Graph graph = new Graph(5);
//        graph.addEdge(0, 1);
//        graph.addEdge(1, 2);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 0);
//        graph.addEdge(2, 4);
//
//        graph.bfs(0);
//        --------------------------------------------------------------------------------------------------

        // 2- DFS
        class Graph2 {
            int E, V;
            LinkedList<Integer>[] adj;

            public Graph2 (int nodes) {
                V = nodes;
                E = 0;
                adj = new LinkedList[nodes];
                for (int i = 0; i<nodes; i++) {
                    adj[i] = new LinkedList<>();
                }
            }

            public void addEdge (int u, int v) {
                adj[u].add(v);
                adj[v].add(u);
                E++;
            }

            public void dfs(int node) {
                boolean[] visited = new boolean[V];
                Stack<Integer> stack = new Stack<>();

                visited[node] = true;
                stack.push(node);

                while (! stack.isEmpty()) {
                    int u = stack.pop();

                    System.out.println(u);

                    for (int i : adj[u]) {
                        if (! visited[i]) {
                            visited[i] = true;
                            stack.push(i);
                        }
                    }
                }


            }

        }

//        Graph2 graph = new Graph2(5);
//        graph.addEdge(0, 1);
//        graph.addEdge(1, 2);
//        graph.addEdge(2, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 0);
//
//        graph.dfs(0);
//        --------------------------------------------------------------------------------------------------
    }
}