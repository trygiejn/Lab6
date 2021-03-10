class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
          treeName = "";
          treeType = "";
          leavesFall = false;
          leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
          treeName = aTreeName;
          treeType = aTreeType;
          leavesFall = aLeavesFall;
          leafColor = aLeafColor;
  }
  
  String getName() {
          return treeName;
  }

  String getType() {
          return treeType;
  }

  boolean getFall() {
          return leavesFall;
  }

  String getColor() {
          return leafColor;
  }

  void setName(String theName) {
          treeName = theName;
  }

  void setType(String theType) {
          treeType = theType;
  }

  void setFall(boolean theFall) {
          leavesFall = theFall;
  }

  void setColor(String theColor) {
          leafColor = theColor;
  }
  

  void print() {
    if (leavesFall) {
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " tree and its leaves are currently " + leafColor + ". It does lose it's leaves for the winter.");
  }
    else {
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " tree and its leaves are currently " + leafColor + ". It does not lose it's leaves for the winter.");
    }

  }
}