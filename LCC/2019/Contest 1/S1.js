let [y1, m1, d1, l1] = gets().split(' ').map(s => Number(s));
let [y2, m2, d2, l2] = gets().split(' ').map(s => Number(s));
let start1 = new Date(y1, m1-1, d1);
let end1 = new Date(y1, m1-1, d1+l1);
let start2 = new Date(y2, m2-1, d2);
let end2 = new Date(y2, m2-1, d2+l2);
if(end1 <= start2 || end2 <= start1){
    print("NO");
}
else{
    print("YES");
}