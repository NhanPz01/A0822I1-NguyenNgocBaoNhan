let courses = [
  {
    "id": 1,
    "title": "ReatcJS Tutorial",
    "rating": 4.2
  },
  {
    "id": 2,
    "title": "Angular Tutorial",
    "rating": 2.5
  },
  {
    "id": 3,
    "title": "VueJS Tutorial",
    "rating": 3.8
  },
  {
    "id": 4,
    "title": "Java Tutorial",
    "rating": 4
  },
  {
    "id": 5,
    "title": "JavaScript Tutorial",
    "rating": 3.5
  }
]

// Yêu cầu 1: Xuất ra danh sách các course có rating >= 4
console.group("Yeu cau 1")
let result = courses.filter((course) => {
  if (course.rating >= 4) {
    return course
  }
})

console.log(result);
console.groupEnd()

// Yêu cầu 2: In ra các course có rating < 4 và in ra theo định dạng <id> - <title> - <rating>
console.group("Yeu cau 2")
result = courses.filter((course) => {
  if (course.rating < 4) {
    return course
  }
}).map((course) => {
  return "" + course.id + "-" + course.title + "-" + course.rating
})
console.log(result);
console.groupEnd()

// Yêu cầu 3: Viết hàm gộp 2 mảng courses và addedCourses
let