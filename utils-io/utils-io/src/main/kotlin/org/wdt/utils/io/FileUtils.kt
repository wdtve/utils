package org.wdt.utils.io

import java.io.File
import java.io.FileReader
import java.io.InputStream
import java.io.OutputStream
import java.util.*

fun File.readFileToString(): String {
  return FileUtils.readFileToString(this)
}

fun File.deleteFile() {
  FileUtils.deleteFile(this)
}

fun File.writeStringToFile(string: String, boolean: Boolean = false) {
  FileUtils.writeStringToFile(this, string, boolean)
}

fun File.writeStringToFile(boolean: Boolean = false, block: () -> String) {
  FileUtils.writeStringToFile(this, block(), boolean)
}


fun File.touch() {
  FileUtils.touch(this)
}

fun File.readFileToLine(): List<String> {
  return FileUtils.readFileToLines(this)
}

fun File.sizeOf(): Long {
  return PathUtils.sizeOf(this.toPath())
}

fun File.deleteDirectory() {
  FileUtils.deleteDirectory(this)
}

fun File.newOutputStream(): OutputStream {
  return FileUtils.newOutputStream(this)
}

fun File.newInputStream(): InputStream {
  return FileUtils.newInputStream(this)
}

fun File.isFileOlder(date: Date): Boolean {
  return FileUtils.isFileOlder(this, date)
}

fun File.isFileOlder(long: Long): Boolean {
  return FileUtils.isFileOlder(this, long)
}

fun File.createDirectories() {
  FileUtils.createDirectories(this)
}

fun File.copyFile(file: File) {
  FileUtils.copyFile(this, file)
}

fun File.sizeOfDirectory(): Long {
  return FileUtils.sizeOfDirectory(this)
}

fun File.isFileExists(): Boolean {
  return FileUtils.isFileExists(this)
}

fun File.isFileNotExists(): Boolean {
  return FileUtils.isFileNotExists(this)
}

fun File.sha1(): String {
  return FileUtils.getFileSha1(this)
}

fun String.toFile(): File {
  return File(this)
}

fun String.toFile(child: String): File {
  return File(this, child)
}

fun File.toFile(child: String): File {
  return File(this, child)
}

fun File.newReader(): FileReader {
  return FileReader(this)
}