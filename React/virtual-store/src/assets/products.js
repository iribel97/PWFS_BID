class Product {
    constructor(id, title, description, price, stock, images, colors, onsale, quantity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.images = images;
        this.colors = colors;
        this.onsale = onsale;
        this.quantity = quantity;
    }
}

const prod1 = new Product(
    "P7Q8R9",
    "iPad Pro 12.9",
    "The iPad Pro 12.9 is a stunning piece of technology, boasting a large 12.9-inch Retina display with ProMotion technology. With 256GB of storage, this iPad provides ample space for all your files, apps, and multimedia content. The sleek and slim design, combined with the silver color, gives it a sophisticated look. Enjoy seamless connectivity with the WiFi feature. Capture your memorable moments with the high-quality camera and relive them on the impressive screen. Whether you're a professional artist, student, or just someone who appreciates cutting-edge technology, the iPad Pro 12.9 is a versatile device that meets all your needs.",
    900000,
    1,
    [
        "https://i.postimg.cc/kX8PKZpq/ipad.jpg",
        "https://i.postimg.cc/jqBrWKvM/ipad2.jpg",
    ],
    ["Silver", "Space Gray", "Gold"],
    false
);
const prod2 = new Product(
    "P7Q8R90",
    "iPad Pro 13",
    "The iPad Pro 13 is a stunning piece of technology, boasting a large 12.9-inch Retina display with ProMotion technology. With 256GB of storage, this iPad provides ample space for all your files, apps, and multimedia content. The sleek and slim design, combined with the silver color, gives it a sophisticated look. Enjoy seamless connectivity with the WiFi feature. Capture your memorable moments with the high-quality camera and relive them on the impressive screen. Whether you're a professional artist, student, or just someone who appreciates cutting-edge technology, the iPad Pro 12.9 is a versatile device that meets all your needs.",
    800000,
    1,
    [
        "https://i.postimg.cc/jqBrWKvM/ipad2.jpg",
        "https://i.postimg.cc/kX8PKZpq/ipad.jpg",
    ],
    ["Silver", "Space Gray", "Gold"],
    true
);
const prod3 = new Product(
    "S1T2U3",
    "Sony WH-1000XM4",
    "Immerse yourself in the world of music with the Sony WH-1000XM4 wireless headphones. These over-ear headphones feature industry-leading noise cancellation technology, ensuring a premium listening experience in any environment. The sleek black color adds a touch of elegance. With multiple touch controls, you can easily manage your music playback and calls. The headphones are equipped with a powerful battery that provides hours of listening on a single charge. Whether you're commuting, traveling, or simply enjoying your favorite tunes at home, the Sony WH-1000XM4 delivers unparalleled sound quality and comfort.",
    250000,
    1,
    [
        "https://i.postimg.cc/pVsHPznM/sony1.jpg",
        "https://i.postimg.cc/L58Fz6wW/sony1.webp",
        "https://i.postimg.cc/7ht8XryZ/sony2.jpg",
    ],
    ["Black", "Silver"],
    false
);
const prod4 = new Product(
    "S1T2U30",
    "Sony WH-1000",
    "Immerse yourself in the world of music with the Sony WH-1000XM4 wireless headphones. These over-ear headphones feature industry-leading noise cancellation technology, ensuring a premium listening experience in any environment. The sleek black color adds a touch of elegance. With multiple touch controls, you can easily manage your music playback and calls. The headphones are equipped with a powerful battery that provides hours of listening on a single charge. Whether you're commuting, traveling, or simply enjoying your favorite tunes at home, the Sony WH-1000XM4 delivers unparalleled sound quality and comfort.",
    200000,
    1,
    [
        "https://i.postimg.cc/L58Fz6wW/sony1.webp",
        "https://i.postimg.cc/pVsHPznM/sony1.jpg",
        "https://i.postimg.cc/7ht8XryZ/sony2.jpg",
    ],
    ["Black", "Silver"],
    true
);
const prod5 = new Product(
    "V4W5X6",
    "GoPro HERO9 Black",
    "Capture your adventures in stunning detail with the GoPro HERO9 Black. This action camera boasts 5K video recording and is waterproof, making it perfect for all your outdoor activities. The sleek black design adds a touch of style to your gear. With multiple shooting modes and advanced features, the HERO9 Black is a versatile tool for both professionals and enthusiasts. Share your experiences with the world through high-quality footage and photos. Whether you're diving into the ocean, skiing down the slopes, or simply exploring your surroundings, the GoPro HERO9 Black is your reliable companion.",
    400000,
    1,
    [
        "https://i.postimg.cc/WbcbB2MB/gopro12.png",
        "https://i.postimg.cc/8k6zXFrd/gopro2.png",
    ],
    ["Black"],
    false
);
const prod6 = new Product(
    "V4W5X60",
    "GoPro HE9",
    "Capture your adventures in stunning detail with the GoPro HERO9 Black. This action camera boasts 5K video recording and is waterproof, making it perfect for all your outdoor activities. The sleek black design adds a touch of style to your gear. With multiple shooting modes and advanced features, the HERO9 Black is a versatile tool for both professionals and enthusiasts. Share your experiences with the world through high-quality footage and photos. Whether you're diving into the ocean, skiing down the slopes, or simply exploring your surroundings, the GoPro HERO9 Black is your reliable companion.",
    300000,
    1,
    [
        "https://i.postimg.cc/8k6zXFrd/gopro2.png",
        "https://i.postimg.cc/WbcbB2MB/gopro12.png",
    ],
    ["Black"],
    true
);
const prod7 = new Product(
    "Y7Z8A9",
    "Kindle Paperwhite",
    "Experience the joy of reading with the Kindle Paperwhite. This e-reader features a 6-inch high-resolution display with built-in lighting, providing a comfortable reading experience in any lighting conditions. With WiFi connectivity, you can easily access a vast library of books and other content. The sleek design and compact size make it perfect for on-the-go reading. Whether you're a bookworm or a casual reader, the Kindle Paperwhite offers a convenient and enjoyable way to indulge in your favorite literary adventures.",
    100000,
    2,
    [
        "https://i.postimg.cc/nzqG0FKH/kindle1.jpg",
        "https://i.postimg.cc/2ymFtsTn/kindle2.jpg",
    ],
    ["Black", "White"],
    false
);
const prod8 = new Product(
    "Y7Z8A90",
    "Kindle PW Mini",
    "Experience the joy of reading with the Kindle Paperwhite. This e-reader features a 5-inch high-resolution display with built-in lighting, providing a comfortable reading experience in any lighting conditions. With WiFi connectivity, you can easily access a vast library of books and other content. The sleek design and compact size make it perfect for on-the-go reading. Whether you're a bookworm or a casual reader, the Kindle Paperwhite offers a convenient and enjoyable way to indulge in your favorite literary adventures.",
    50000,
    2,
    [
        "https://i.postimg.cc/2ymFtsTn/kindle2.jpg",
        "https://i.postimg.cc/nzqG0FKH/kindle1.jpg",
    ],
    ["Black", "White"],
    true
);
const prod9 = new Product(
    "B1C2D3",
    "Bose SoundLink Revolve",
    "Elevate your audio experience with the Bose SoundLink Revolve Bluetooth speaker. Its sleek design and black color make it a stylish addition to any space. Enjoy 360-degree sound coverage, creating an immersive listening experience. With wireless connectivity, you can easily connect your devices and play your favorite music. The built-in rechargeable battery ensures hours of playback on a single charge. Whether you're hosting a party or enjoying a quiet evening at home, the Bose SoundLink Revolve delivers rich and clear audio that enhances every moment.",
    200000,
    1,
    [
        "https://i.postimg.cc/QM5P5rz3/bose1.jpg",
        "https://i.postimg.cc/JnLF52wB/bose2.jpg",
        "https://i.postimg.cc/wvQGfQH4/bose3.jpg",
    ],
    ["Black", "Silver"],
    false
);
const prod10 = new Product(
    "B1C2D30",
    "Bose SoundLink Terminator",
    "Elevate your audio experience with the Bose SoundLink Revolve Bluetooth speaker. Its sleek design and black color make it a stylish addition to any space. Enjoy 360-degree sound coverage, creating an immersive listening experience. With wireless connectivity, you can easily connect your devices and play your favorite music. The built-in rechargeable battery ensures hours of playback on a single charge. Whether you're hosting a party or enjoying a quiet evening at home, the Bose SoundLink Revolve delivers rich and clear audio that enhances every moment.",
    100000,
    1,
    [
        "https://i.postimg.cc/wvQGfQH4/bose3.jpg",
        "https://i.postimg.cc/QM5P5rz3/bose1.jpg",
        "https://i.postimg.cc/JnLF52wB/bose2.jpg",
    ],
    ["Black", "Silver"],
    true
);
const prod11 = new Product(
    "A1B2C3",
    "MacBook Pro 13'4",
    "Experience the power of creativity with the MacBook Pro 13'4. Featuring 8GB of RAM and 512GB of storage, this laptop provides the performance and storage capacity needed for demanding tasks. The sleek design in silver and space gray adds a touch of sophistication. The high-resolution Retina display brings your visuals to life, whether you're editing photos, creating videos, or simply browsing the web. With the latest technology and a lightweight build, the MacBook Pro 13'4 is the perfect companion for professionals and creative individuals alike.",
    750000,
    1,
    [
        "https://i.postimg.cc/HxGQcrcp/mock1.jpg",
        "https://i.postimg.cc/Y91Q1tYQ/mock2.jpg",
    ],
    ["Silver", "Space Gray"],
    false
);
const prod12 = new Product(
    "A1B2C3",
    "MacBook 12'",
    "Experience the power of creativity with the MacBook Pro 13'4. Featuring 8GB of RAM and 512GB of storage, this laptop provides the performance and storage capacity needed for demanding tasks. The sleek design in silver and space gray adds a touch of sophistication. The high-resolution Retina display brings your visuals to life, whether you're editing photos, creating videos, or simply browsing the web. With the latest technology and a lightweight build, the MacBook Pro 13'4 is the perfect companion for professionals and creative individuals alike.",
    500000,
    1,
    [
        "https://i.postimg.cc/Y91Q1tYQ/mock2.jpg",
        "https://i.postimg.cc/HxGQcrcp/mock1.jpg",
    ],
    ["Silver", "Space Gray"],
    true
);
const prod13 = new Product(
    "D4E5F6",
    "MacBook Pro 15'4",
    "Unleash your productivity with the MacBook Pro 15'4. Boasting 8GB of RAM and 512GB of storage, this laptop is a powerhouse for multitasking and content creation. The silver and space gray colors add a touch of elegance to its design. The large Retina display provides a stunning visual experience for all your tasks, from graphic design to video editing. Whether you're a professional on the go or a creative individual working on intensive projects, the MacBook Pro 15'4 delivers the performance you need.",
    800000,
    2,
    [
        "https://i.postimg.cc/L5W4515D/note.jpg",
        "https://i.postimg.cc/HxGQcrcp/mock1.jpg",
        "https://i.postimg.cc/Y91Q1tYQ/mock2.jpg",
    ],
    ["Silver", "Space Gray"],
    false
);
const prod14 = new Product(
    "D4E5F60",
    "MacBook Pro 17'",
    "Unleash your productivity with the MacBook Pro 15'4. Boasting 8GB of RAM and 512GB of storage, this laptop is a powerhouse for multitasking and content creation. The silver and space gray colors add a touch of elegance to its design. The large Retina display provides a stunning visual experience for all your tasks, from graphic design to video editing. Whether you're a professional on the go or a creative individual working on intensive projects, the MacBook Pro 15'4 delivers the performance you need.",
    900000,
    2,
    [
        "https://i.postimg.cc/Y91Q1tYQ/mock2.jpg",
        "https://i.postimg.cc/HxGQcrcp/mock1.jpg",
    ],
    ["Silver", "Space Gray"],
    true
);
const prod15 = new Product(
    "G7H8I9",
    "Lenovo",
    "Enhance your computing experience with the Lenovo 13'4 laptop. Featuring 8GB of RAM and 256GB of storage, this laptop offers a perfect balance of performance and portability. The sleek design, combined with the black and silver colors, adds a touch of sophistication. The 13'4 display provides crisp visuals for work or entertainment. With the latest technology and a compact form factor, the Lenovo laptop is an ideal choice for professionals and students alike.",
    75000,
    1,
    [
        "https://i.postimg.cc/L5W4515D/note.jpg",
        "https://i.postimg.cc/HxGQcrcp/mock1.jpg",
        "https://i.postimg.cc/Y91Q1tYQ/mock2.jpg",
    ],
    ["Black", "Silver"],
    false
);
const prod16 = new Product(
    "G7H8I90",
    "Lenovo",
    "Enhance your computing experience with the Lenovo 13'4 laptop. Featuring 8GB of RAM and 256GB of storage, this laptop offers a perfect balance of performance and portability. The sleek design, combined with the black and silver colors, adds a touch of sophistication. The 13'4 display provides crisp visuals for work or entertainment. With the latest technology and a compact form factor, the Lenovo laptop is an ideal choice for professionals and students alike.",
    45000,
    1,
    [
        "https://i.postimg.cc/HxGQcrcp/mock1.jpg",
        "https://i.postimg.cc/Y91Q1tYQ/mock2.jpg",
    ],
    ["Black", "Silver"],
    true
);
const prod17 = new Product(
    "J1K2L3",
    "Samsung Galaxy S21",
    "Unleash the power of innovation with the Samsung Galaxy S21 smartphone. With 128GB of storage and a sleek black color, this smartphone combines style with functionality. The advanced camera system captures stunning photos and videos, whether you're exploring nature or documenting everyday moments. The vibrant display and powerful processor provide a seamless and immersive user experience. Stay connected with high-speed connectivity and enjoy all the features and apps the Galaxy S21 has to offer. Elevate your mobile experience with this cutting-edge smartphone from Samsung.",
    500000,
    1,
    [
        "https://i.postimg.cc/Jn2C5W84/galaxy1.webp",
        "https://i.postimg.cc/hvQWC348/galaxy2.jpg",
        "https://i.postimg.cc/j55rfSGF/galaxy3.jpg",
    ],
    ["Black", "Silver", "White"],
    false
);
const prod18 = new Product(
    "J1K2L30",
    "Samsung Galaxy S21 PRO",
    "Unleash the power of innovation with the Samsung Galaxy S21 smartphone. With 128GB of storage and a sleek black color, this smartphone combines style with functionality. The advanced camera system captures stunning photos and videos, whether you're exploring nature or documenting everyday moments. The vibrant display and powerful processor provide a seamless and immersive user experience. Stay connected with high-speed connectivity and enjoy all the features and apps the Galaxy S21 has to offer. Elevate your mobile experience with this cutting-edge smartphone from Samsung.",
    500000,
    1,
    [
        "https://i.postimg.cc/hvQWC348/galaxy2.jpg",
        "https://i.postimg.cc/Jn2C5W84/galaxy1.webp",
        "https://i.postimg.cc/j55rfSGF/galaxy3.jpg",
    ],
    ["Black", "Silver", "White"],
    false
);
const prod19 = new Product(
    "M4N5O6",
    "Apple Watch Series 6",
    "Embrace a healthier lifestyle with the Apple Watch Series 6. With a 44mm display, GPS functionality, and a sleek space gray color, this smartwatch is the perfect companion for your fitness journey. Track your workouts, monitor your health, and stay connected on the go. The high-resolution Retina display provides clear visuals, whether you're checking notifications or tracking your fitness goals. With a variety of customizable watch faces and bands, the Apple Watch Series 6 lets you express your personal style while enjoying the latest in wearable technology.",
    300000,
    1,
    [
        "https://i.postimg.cc/VstzWdJx/watch.jpg",
        "https://i.postimg.cc/3N278cM8/watch1.jpg",
    ],
    ["Space Gray", "Silver", "Gold"],
    false
);
const prod20 = new Product(
    "M4N5O60",
    "Apple Watch Series 5",
    "Embrace a healthier lifestyle with the Apple Watch Series 6. With a 44mm display, GPS functionality, and a sleek space gray color, this smartwatch is the perfect companion for your fitness journey. Track your workouts, monitor your health, and stay connected on the go. The high-resolution Retina display provides clear visuals, whether you're checking notifications or tracking your fitness goals. With a variety of customizable watch faces and bands, the Apple Watch Series 6 lets you express your personal style while enjoying the latest in wearable technology.",
    100000,
    1,
    [
        "https://i.postimg.cc/3N278cM8/watch1.jpg",
        "https://i.postimg.cc/VstzWdJx/watch.jpg",
    ],
    ["Space Gray", "Silver", "Gold"],
    false
);

const products = [
    prod1,
    prod11,
    prod14,
    prod18,
    prod13,
    prod4,
    prod16,
    prod6,
    prod7,
    prod8,
    prod19,
    prod9,
    prod10,
    prod12,
    prod3,
    prod14,
    prod15,
    prod5,
    prod17,
    prod2,
    prod20,
];

export default products;