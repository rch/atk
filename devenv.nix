{ pkgs, ... }:

{
  packages = [
    pkgs.git
    pkgs.gradle
    pkgs.jdk11
    pkgs.kotlin
    pkgs.kubernetes-helm
    pkgs.operator-sdk
  ];

  services.postgres = {
    enable = true;
    package = pkgs.postgresql_15;
    initialDatabases = [{ name = "analysis_toolkit"; }];
    initialScript = "CREATE USER postgres SUPERUSER; CREATE DATABASE postgres WITH OWNER postgres;";
  };
}
