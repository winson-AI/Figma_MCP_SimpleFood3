# 🍔 Foodgo - Food Delivery App

A modern food delivery application built with **Kotlin Multiplatform** and **Compose Multiplatform**, featuring a beautiful UI designed in Figma and implemented with Material Design 3 principles.

## 📱 App Overview

Foodgo is a food delivery app that allows users to browse and order their favorite food items. The app features a clean, modern interface with:

- **Home Screen**: Browse food categories and featured items
- **Search & Filter**: Find specific food items with advanced filtering
- **Food Cards**: Beautiful product cards with ratings and favorites
- **Bottom Navigation**: Intuitive navigation with floating action button

## 🎨 Design Implementation

The app UI is meticulously implemented from a Figma design, featuring:

- **Color Scheme**: 
  - Primary Red: `#EF2A39`
  - Dark Text: `#3C2F2F`
  - Gray Text: `#6A6A6A`
  - Special Purple: `#481FCD` (for Cheeseburger title)
  - Star Rating: `#FF9633`

- **Typography**:
  - "Foodgo" title: Cursive font, 45sp
  - Subtitle: Medium weight, 18sp
  - Card titles: SemiBold/Bold, 16sp
  - Body text: Normal weight, 16sp

- **Layout Components**:
  - Rounded corners (20dp radius)
  - Subtle shadows for depth
  - Proper spacing and alignment
  - Responsive grid layout

## 🏗️ Project Structure

This is a **Kotlin Multiplatform** project targeting Android and iOS platforms.

### 📁 Directory Structure

```
├── composeApp/                    # Shared Compose Multiplatform code
│   ├── src/
│   │   ├── commonMain/           # Code shared across all platforms
│   │   │   ├── kotlin/          # Kotlin source files
│   │   │   │   └── com/example/simplefood3/
│   │   │   │       └── App.kt   # Main UI implementation
│   │   │   └── composeResources/ # Shared resources
│   │   │       └── drawable/    # Images, icons, and assets
│   │   ├── androidMain/         # Android-specific code
│   │   │   └── kotlin/
│   │   │       └── MainActivity.kt
│   │   └── iosMain/             # iOS-specific code
│   └── build.gradle.kts         # Build configuration
├── iosApp/                      # iOS application entry point
└── build.gradle.kts            # Root build configuration
```

### 🎯 Key Components

#### Main UI (`App.kt`)
- **Header Section**: App title, subtitle, and user avatar
- **Search Bar**: White search input with red filter button
- **Category Tabs**: Horizontal scrollable food categories
- **Food Grid**: 2x2 grid of food item cards
- **Bottom Navigation**: Curved navigation bar with floating action button

#### Reusable Components
- `CategoryButton`: Interactive category selection buttons
- `BurgerCard`: Food item cards with images, titles, ratings, and favorites
- `BottomNavigation`: Navigation bar with icons and floating add button

## 🖼️ Assets & Resources

### Food Images
- `cheese_burger.png` - Cheeseburger with Wendy's branding
- `veggie_burger.png` - Vegetarian burger option
- `chicken_burger.png` - Chicken burger variant
- `fried_chicken_burger.png` - Fried chicken burger
- `profile_avatar.png` - User profile picture

### Icons (Vector Drawables)
- `search.xml` - Search magnifying glass icon
- `filter.xml` - Filter/settings icon
- `heart.xml` - Heart/favorite icon
- `home.xml` - Home navigation icon
- `comment.xml` - Comment/chat icon
- `icon_add.xml` - Plus/add icon
- `star.xml` - Star rating icon

### Effects
- `shadow_ellipse.xml` - Shadow effect for food images
- `dot.xml` - Small indicator dot
- `line.xml` - Decorative line element

## 🚀 Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- Kotlin 1.9.0 or later
- JDK 11 or later
- Xcode 14+ (for iOS development)

### Building the Project

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Figma_MCP_SimpleFood3
   ```

2. **Build for Android**
   ```bash
   ./gradlew assembleDebug
   ```
   The APK will be generated at: `composeApp/build/outputs/apk/debug/`

3. **Build for iOS**
   ```bash
   ./gradlew iosSimulatorArm64Test
   ```

### Running the App

#### Android
- Open the project in Android Studio
- Connect an Android device or start an emulator
- Click "Run" or use `./gradlew installDebug`

#### iOS
- Open `iosApp/iosApp.xcodeproj` in Xcode
- Select a simulator or device
- Click "Run" to build and launch

## 🛠️ Technology Stack

- **Kotlin Multiplatform**: Cross-platform development
- **Compose Multiplatform**: Modern declarative UI framework
- **Material Design 3**: Design system and components
- **Gradle**: Build system with Kotlin DSL
- **Figma**: Design source and asset management

## 📋 Features

### ✅ Implemented
- [x] Complete UI matching Figma design
- [x] Responsive layout for different screen sizes
- [x] Interactive elements (buttons, cards)
- [x] Proper resource management
- [x] Cross-platform compatibility
- [x] Material Design 3 theming

### 🔄 Future Enhancements
- [ ] State management (ViewModel/StateFlow)
- [ ] Navigation between screens
- [ ] Food item details page
- [ ] Shopping cart functionality
- [ ] User authentication
- [ ] Real API integration
- [ ] Push notifications

## 🎯 Design Fidelity

The implementation achieves high fidelity with the original Figma design:

- **Layout**: Exact positioning and spacing
- **Colors**: Precise color matching
- **Typography**: Proper font weights and sizes
- **Shadows**: Accurate shadow effects
- **Interactions**: Smooth clickable elements
- **Responsiveness**: Adapts to different screen sizes

## 📱 Screenshots

The app features a beautiful home screen with:
- Clean header with app branding
- Functional search and filter interface
- Attractive food category tabs
- High-quality food item cards
- Modern bottom navigation

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test on both Android and iOS
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🔗 Resources

- [Kotlin Multiplatform Documentation](https://kotlinlang.org/docs/multiplatform.html)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
- [Material Design 3](https://m3.material.io/)
- [Figma Design System](https://www.figma.com/)

---

**Built with ❤️ using Kotlin Multiplatform and Compose**