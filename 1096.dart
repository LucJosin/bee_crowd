void main() {
  int I, J = 7;
 
  for (I = 1; I <= 9; I += 2) {
    print('I=$I J=$J');
    print('I=$I J=${J - 1}');
    print('I=$I J=${J - 2}');
  }
}
