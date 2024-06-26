# Singleton

## Khái niệm

- Là một trong nhóm Creational, nó sẽ đảm bảo duy nhất một thể thiện được tạo, hay còn có thể giải thích là xuyên suốt quá trình hoạt động của ứng dụng chỉ có duy nhất một đối tượng được tạo ra từ một class.

## Được sử dụng trong những trường hợp nào?

- Đảm bảo chỉ có một thể hiện(instance) duy nhất của một class.
- Có thể quản lý số lượng thể hiện của một lớp trong giới hạn mong muốn.

## Nguyên tắc để tạo lên một Singleton

- Hàm tạo hay còn gọi là constructor có thể truy cập với private tức chỉ có thể truy xuất trong nội bộ của class.
- Thể hiện của nó được đặt dạng ' private static final variable' để đảm bảo biến chỉ được khởi tạo trong class.
- có một method 'public static' để trả về thể hiện được đề cập bên trên.

## Có những cách tạo ra Singleton theo từng trường hợp sử dụng

- Trên thực tế chúng ta có rất nhiều cách để tạo ra một Singleton tuy nhiên mình sẽ chỉ giới thiệu những mẫu chính và thường gặp.
- Gồm 4 trường hợp sau : Eager initialization, Lazy Initialization, Thread Safe, Double Check Locking.
