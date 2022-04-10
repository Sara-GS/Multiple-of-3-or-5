function solution(number){
    let sum = 0;
    for (var i = 0; i < number < 1000; i++) {
      if (i % 3 === 0 || i % 5 === 0) {
        sum += i;
      }
    }
    return sum;
  }
