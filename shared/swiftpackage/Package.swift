// swift-tools-version:5.3
import PackageDescription

let package = Package(
    name: "RedouteSharedPackage",
    platforms: [
        .iOS(.v14)
    ],
    products: [
        .library(
            name: "RedouteSharedPackage",
            targets: ["RedouteSharedPackage"]
        ),
    ],
    targets: [
        .binaryTarget(
            name: "RedouteSharedPackage",
            path: "./RedouteSharedPackage.xcframework"
        ),
    ]
)
