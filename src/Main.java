import ra.Animals;
import ra.Cat;
import ra.Chicken;
import ra.IAnimals;

public class Main {
    public static void main(String[] args) {
      // khởi tạo từ interface
        IAnimals iAnimals = new Cat();
        // khởi tạo từ abstract class
        Animals animals = new Chicken();
        // khởi tạo gián tiếp thông qua lớp nặc danh
        IAnimals animals1 = new IAnimals() {
            @Override
            public void eat() {
                System.out.println("đang ăn");
            }

            @Override
            public void move() {
                System.out.println("di chuyên ...");
            }
        };

        Animals  animals2 = new Animals() {
            @Override
            public void makeSound() {
                // code implement ở đây
            }
        };
        // bài tập lớn  :
//         Tạo menu chức năng sau
            /*
            =========================MENU========================
            1. Quản lí danh mục
            2. Quản lí sản phẩm.
            3. Thoát.
             */
        // trong mênu quản lí danh mục
//        thực hiện các chức năng
         /*
         ====================Quản lí danh mục==================
         1. Hiên thị danh sách danh mục
         2. Thêm mới danh mục
         3. Cập nhật danh mục
         4. Xóa dnh mục (check xem danh mục có tồn tại sp ko mới được xóa)
         5. Quay lại
          */
        // trong mênu quản lí sản phẩm
//        thực hiện các chức năng
         /*
         ====================Quản lí sản phẩm==================
         1. Hiên thị danh sách sản phẩm
         2. Thêm mới sản phẩm
         3. Cập nhật sản phẩm
         4. Xóa sản phẩm
         5. tìm kiếm sản phảm theo tên sp
         6. Quay lại
          */



    }

}