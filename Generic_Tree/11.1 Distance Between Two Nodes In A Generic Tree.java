public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> p1 = nodeToRootPath(node, d1);
    ArrayList<Integer> p2 = nodeToRootPath(node, d2);

    int i = p1.size() - 1;
    int j = p2.size() - 1;

    while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j)){
      i--;
      j--;
    }

    return p1.get(i + 1);
  }

  public static int distanceBetweenNodes(Node node, int d1, int d2){
    // write your code here
    ArrayList<Integer> a1 = nodeToRootPath(node,d1);
    ArrayList<Integer> a2 =  nodeToRootPath(node,d2);

    int i=a1.size()-1;
    int j=a2.size()-1;

    while(i>=0 && j>=0 && a1.get(i)==a2.get(j))
    {
      i--;
      j--;
    }
    i++;
    j++;
    return i+j;
    

  }