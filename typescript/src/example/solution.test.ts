import { describe, it, expect } from 'vitest'
import { add } from './solution'

describe('Example: Add Two Numbers', () => {
  it('should add two positive numbers', () => {
    expect(add(2, 3)).toBe(5)
  })

  it('should add negative numbers', () => {
    expect(add(-1, -1)).toBe(-2)
  })

  it('should add zero', () => {
    expect(add(5, 0)).toBe(5)
  })
})
