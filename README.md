# JVM OpenTelemetry Conventions use the wrong OTLP data point

## Pre-Requisites

First, install [otel-tui](https://github.com/ymtdzzz/otel-tui) to inspect OTLP data from a terminal.

```shell
brew install ymtdzzz/tap/otel-tui
```

Then, start otel-tui, which will listen on port 4318 for OTLP data.

## Demo with OpenTelemetry Instrumentation

Navigate to the `demo-opentelemetry` directory and run the application:

```shell
./gradlew bootRun
```

You can then view the OTLP data in the terminal. Press `m` to navigate to the Metrics tab, then press `/` to filter for `jvm.memory.limit`. You can browse details of the metric by pressing `d`. Notice how:

* the metric type is `Sum`
* the value is of type `Int`
* the unit is `By`.

Finally, you can stop the application.

## Demo with OpenTelemetry Instrumentation

Navigate to the `demo-micrometer` directory and run the application:

```shell
./gradlew bootRun
```

You can then view the OTLP data in the terminal. Press `m` to navigate to the Metrics tab, then press `/` to filter for `jvm.memory.limit`. Make sure you're visualizing metrics from the `demo-micrometer` application. You can browse details of the metric by pressing `d`. Notice how:

* the metric type is `Gauge`
* the value is of type `Double`
* the unit is `bytes`.

Finally, you can stop the application.
