--EN--
E-Commerce Application - Advanced Java Spring Boot Project
Project Overview
This project is a comprehensive E-Commerce Platform developed using Java Spring Boot, aimed at providing an efficient and scalable shopping experience for both users and administrators. The platform includes key e-commerce functionalities such as product management, order processing, payment integration, and user session management, all within a user-friendly interface.

Features
Product Management: Admins can add, update, and delete products with dynamic management options.
User Management: Users can create accounts, log in, and manage their sessions. Role-based authorization is implemented for users (user/admin).
Cart and Orders: Users can add products to the cart and create orders. Order statuses and details can be tracked.
Payment Integration: Integrated with third-party payment gateways like Stripe.
Product Categorization and Filtering: Users can filter products by categories and perform detailed searches.
Reviews and Ratings: Users can leave reviews and rate purchased products.
Multi-language Support: The application supports multiple languages for a global user base.
Security: Spring Security is used for secure login and authorization.
Technologies Used
Backend: Java 17, Spring Boot, Spring Security, Spring Data JPA
Frontend: React.js, HTML, CSS, Bootstrap
Database: MySQL (with Hibernate ORM)
Payment Integration: Stripe API
API Support: RESTful APIs for communication between frontend and backend.
Testing: JUnit and Mockito for unit and integration testing.
Setup and Running

Clone the Repository:
  git clone https://github.com/BatuhnBostanci/e-commerce_try.git
  
Install Dependencies: Use Maven to install dependencies:
  mvn clean install
Database Setup: 
  Configure the MySQL database in the application.properties file.
Run the Application:
  mvn spring-boot:run
Frontend Setup: Navigate to the frontend folder and run:
  npm install
  npm start

Architecture
The project follows the MVC (Model-View-Controller) architectural pattern to maintain clear separation between the business logic, data access, and user interface layers. This pattern ensures a flexible and maintainable code structure:

Model: Represents data and handles database interactions.
Controller: Manages incoming requests, processes them, and interacts with the Model and View.
Service: Contains the business logic and provides reusable functionality for controllers.
Repository: Handles database operations like CRUD (Create, Read, Update, Delete).
The application uses REST API architecture for communication between the frontend and backend.

Contributing
To contribute to this project, follow these steps:

Fork the repository.
Create a new branch (feature-branch).
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Open a pull request.



--TR--
E-Ticaret Uygulaması - Gelişmiş Java Spring Boot Projesi

Proje Tanımı
Bu proje, Java Spring Boot kullanılarak geliştirilmiş bir E-Ticaret Platformudur. Hem kullanıcı hem de yönetici rollerine sahip kullanıcılar için kapsamlı bir alışveriş deneyimi sunar. Amaç, esnek, ölçeklenebilir ve modern bir e-ticaret uygulaması oluşturarak, kullanıcı dostu bir alışveriş deneyimi sağlamaktır. Bu proje, ürün yönetimi, sipariş işleme, ödeme entegrasyonu ve kullanıcı oturum yönetimi gibi temel e-ticaret işlevlerine odaklanmaktadır.

Özellikler
Ürün Yönetimi: Yöneticiler, ürünleri ekleyebilir, güncelleyebilir ve silebilir. Ürün bilgileri dinamik olarak yönetilebilir.
Kullanıcı Yönetimi: Kullanıcılar hesap oluşturabilir, giriş yapabilir ve oturumlarını yönetebilir. Kullanıcı rolüne göre yetkilendirme yapılmaktadır (kullanıcı/yonetici).
Sepet ve Sipariş: Kullanıcılar ürünleri sepete ekleyebilir ve sipariş oluşturabilirler. Siparişlerin durumu ve detayları takip edilebilir.
Ödeme Sistemi: Stripe gibi üçüncü parti ödeme hizmeti sağlayıcıları ile entegrasyon mevcuttur.
Ürün Kategorilendirme ve Filtreleme: Kullanıcılar, ürünleri kategorilere göre filtreleyebilir ve detaylı aramalar yapabilir.
Yorum ve Değerlendirme: Kullanıcılar, satın aldıkları ürünler hakkında yorum yapabilir ve puan verebilir.
Çoklu Dil Desteği: Uygulama, çoklu dil desteği sağlayarak küresel kullanıcı kitlesine hitap eder.
Güvenlik: Spring Security kullanılarak güvenli oturum açma ve yetkilendirme işlemleri yapılmaktadır.
Teknolojiler
Backend: Java 17, Spring Boot, Spring Security, Spring Data JPA
Frontend: React.js, HTML, CSS, Bootstrap
Veritabanı: MySQL (Hibernate ile ORM)
Ödeme Entegrasyonu: Stripe API
API Desteği: RESTful API'ler aracılığıyla frontend ve backend arasındaki iletişim sağlanır.
Testler: JUnit ve Mockito kullanılarak birim ve entegrasyon testleri uygulanmıştır.

Kurulum ve Çalıştırma

Proje Klonlama:
  git clone https://github.com/BatuhnBostanci/e-commerce_try.git

Bağımlılıkların Yüklenmesi: Maven kullanarak gerekli bağımlılıkları yükleyin:
  mvn clean install

Veritabanı Yapılandırması: 
  application.properties dosyasında MySQL veritabanı ayarlarını yapılandırın.

Uygulamanın Çalıştırılması:
  mvn spring-boot:run

Frontend Yapılandırması: 
  React projesini başlatmak için:

  npm install
  npm start

Mimari
Proje, MVC (Model-View-Controller) mimarisi ile geliştirilmiştir. Bu sayede hem iş katmanı, hem veri erişim katmanı, hem de kullanıcı arayüzü katmanı birbirinden ayrılmıştır. Uygulama, esnek ve sürdürülebilir kod yapısını korumak için katmanlı mimari prensiplerine dayanır:

Model: Veritabanı ile etkileşim sağlayan ve veri modellerini temsil eden sınıfları içerir.
Controller: Kullanıcı taleplerini işler ve uygun iş mantığını çalıştırarak Model ile View arasında köprü görevi görür.
Service: İş mantığını içeren servislerdir. Bu katman, kontrolcülerin iş yükünü hafifletir ve yeniden kullanılabilir fonksiyonlar sağlar.
Repository: Veritabanı işlemlerini yönetir, CRUD (Create, Read, Update, Delete) işlemlerini sağlar.
Uygulama ayrıca REST API mimarisini kullanarak frontend ile backend arasında veri alışverişini sağlar.

Katkıda Bulunma
Projeye katkıda bulunmak için aşağıdaki adımları takip edin:

Projeyi forklayın.
Yeni bir branch oluşturun (feature-branch).
Yaptığınız değişiklikleri commit edin (git commit -m 'Yeni özellik eklemesi').
Branch'i push edin (git push origin feature-branch).
Pull request oluşturun.
