{ pkgs, ... }:

{
  packages = [
    pkgs.jdk11
    pkgs.kotlin
    pkgs.gradle
  ];

}
